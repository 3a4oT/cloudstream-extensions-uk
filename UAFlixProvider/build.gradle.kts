// use an integer for version numbers
version = 5

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}

cloudstream {
    language = "uk"
    // All of these properties are optional, you can safely remove them

    description = "UAFLIX - фільми і серіали NETFLIX українською"
    authors = listOf("CakesTwix")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified

    iconUrl = "https://www.google.com/s2/favicons?domain=uafix.net&sz=%size%"
}
