package karate;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static utils.Constants.*;

public class TestRunner {
    @Test
    void testParallel() {
        Results results = Runner.path(CLASS_PATH)
                .tags()
                .outputCucumberJson(TRUE_VALUE)
                .tags(IGNORE_TAGS)
                .parallel(PARALLEL);
        generateReport(results.getReportDir());
        Assertions.assertEquals(ZERO_VALUE,
                results.getFailCount(), results.getErrorMessages());
    }

    public static void generateReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] {JSON}, true);
        List<String> jsonPaths = new ArrayList<>(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File(TARGET), PROJECT_NAME);
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }

    @BeforeAll
    static void insertData() throws IOException, InterruptedException, SQLException, ClassNotFoundException {

    }

    @AfterAll
    public static void deleteData() throws IOException, SQLException, ClassNotFoundException {

    }
}
