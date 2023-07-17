package com.example.parshipbrands

import android.app.Application
import android.graphics.Color
import android.view.LayoutInflater
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ParshipFragmentTest { // Hier werden die Klassen die getestet werden eingetragen

    private lateinit var scenario: FragmentScenario<ParshipFragment>

    @Before
    fun setup() {
        scenario = FragmentScenario.launchInContainer(ParshipFragment::class.java)
    }

    @Test
    fun toggleButtonParship_Clicked_TextAndColorChanged() {
        scenario.onFragment { fragment ->
            // Überprüfen der ursprünglichen Werte
            assertEquals(false, fragment.getNeedBoolean())
            assertEquals("Parship", fragment.getParshipText())
            assertEquals(Color.RED, fragment.getParshipTextColor())

            // Klick auf den Toggle-Button
            fragment.performToggleClick()

            // Überprüfen der aktualisierten Werte nach dem Klick
            assertEquals(true, fragment.getNeedBoolean())
            assertEquals("Elitepartner", fragment.getParshipText())
            assertEquals(Color.BLUE, fragment.getParshipTextColor())

            // Klick auf den Toggle-Button erneut
            fragment.performToggleClick()

            // Überprüfen der Werte nach dem erneuten Klick
            assertEquals(false, fragment.getNeedBoolean())
            assertEquals("Parship", fragment.getParshipText())
            assertEquals(Color.RED, fragment.getParshipTextColor())
        }
    }
}