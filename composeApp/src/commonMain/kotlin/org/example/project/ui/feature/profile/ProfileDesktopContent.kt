package org.example.project.ui.feature.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kei_1111.composeapp.generated.resources.Res
import kei_1111.composeapp.generated.resources.img_profile_icon
import org.example.project.data.BasicInfoSet
import org.example.project.ui.feature.profile.component.BasicInfoSection
import org.example.project.ui.theme.dimensions.Paddings

@Composable
fun ProfileDesktopContent(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(Paddings.Content),
            ) {
                BasicInfoSection(
                    modifier = Modifier.fillMaxWidth(),
                    profileIcon = Res.drawable.img_profile_icon,
                    name = BasicInfoSet.Name,
                    birthday = BasicInfoSet.Birthday,
                    university = BasicInfoSet.University,
                )
            }
        }
    }
}
