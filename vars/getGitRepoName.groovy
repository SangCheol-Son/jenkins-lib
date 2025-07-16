def call() {
    def gitRepoUrl = scm.getUserRemoteConfigs()[0].getUrl()
    def gitRepoName = gitRepoUrl.tokenize('/').last().replaceAll(/\.git$/, '')
	
    return gitRepoName
}
출처: https://naro-security.tistory.com/56#article-3-3-3--3--sonarqube-설치 [naroSEC:티스토리]
