package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v2018_1.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'SampleProject2_Build2'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("SampleProject2_Build2")) {
    features {
        add {
            swabra {
                filesCleanup = Swabra.FilesCleanup.DISABLED
            }
        }
    }
}
