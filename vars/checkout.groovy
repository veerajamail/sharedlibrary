// vars/checkout.groovy
def call(Map config = [:]) {
    def repoUrl = config.repoUrl ?: error("Missing 'repoUrl'")
    def branch = config.branch ?: 'main'
    def credentialsId = config.credentialsId ?: ''

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [],
        submoduleCfg: [],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credentialsId
        ]]
    ])
}

