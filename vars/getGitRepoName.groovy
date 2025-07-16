def call() {
    def gitRepoUrl = scm.getUserRemoteConfigs()[0].getUrl()
    def gitRepoName = gitRepoUrl.tokenize('/').last().replaceAll(/\.git$/, '')
	
    return gitRepoName
}
