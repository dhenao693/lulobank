function fn() {
    var env = karate.env;
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev';
    }

    var config = {
    apiUrl: 'https://' + java.lang.System.getenv('FEATURE_URL') + '.menu-or.muydev.com/api'
    }

    if (env == 'dev') {
        config.issuer = java.lang.System.getenv('SSO_ISSUER');
        config.auth_key = java.lang.System.getenv('SSO_AUTH_KEY');
        config.auth_secret = java.lang.System.getenv('SSO_AUTH_SECRET');
    };

    var accessToken = karate.callSingle('classpath:token/CreateToken.feature', config).authToken
    karate.configure('headers', {
        Authorization: 'Bearer ' + accessToken
    })
    return config;
}