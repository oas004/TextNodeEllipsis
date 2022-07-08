package com.example.textnodeellipsis

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    // This test runs green with and without TextOverflow.Ellipsis
    // Since the text node has the entire text and not the clipped text.
    @Test
    fun test_text_overflow() {
        composeTestRule.setContent {
            Greeting()
        }
        composeTestRule.onNodeWithTag("greeting").assert(hasText("Hello very very very very very very very long name or something like that"))
    }

}