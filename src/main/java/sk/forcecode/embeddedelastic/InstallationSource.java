package sk.forcecode.embeddedelastic;

import java.net.URL;

interface InstallationSource {
    String determineVersion();

    URL resolveDownloadUrl();
}

