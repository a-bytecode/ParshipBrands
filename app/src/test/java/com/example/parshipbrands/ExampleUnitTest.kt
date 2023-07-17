package com.example.parshipbrands
import android.graphics.Color
import android.os.Build.VERSION_CODES.Q
import androidx.fragment.app.testing.FragmentScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.annotation.Config


/*
* @RunWith(AndroidJUnit4::class) -> Testrunner bietet Erweiterte Funktionen für die Ausführung
* von Instrumentationstests auf Android Geräten oder Emulatoren.
*/
@RunWith(AndroidJUnit4::class)
/*
* sdk = [Q] ist erforderlich, wenn meine SDK größer als 29 ist.
* Roboelectric Dependencies unterstützten keine SDK Version die größer als 29 ist.
*/
@Config(sdk = [Q])

class ParshipFragmentTest { // Hier wird eine Klasse erstellt in der sich alle Testing Tasks befinden.
    /*
    * Hier initialisieren wir das ParshipFragment damit wir auf die erforderlichen
    * Funktionen innerhalb des Fragmentes zugreifen können.
    */
    private var fragment = ParshipFragment()
    private var scenario: FragmentScenario<ParshipFragment> = FragmentScenario.launchInContainer(fragment::class.java) as FragmentScenario<ParshipFragment>

    @Test
    fun toggleButtonParship_Clicked_TextAndColorChanged() {
        scenario.onFragment { fragment ->
            // Hier überprüfen die ursprünglichen Werte sprich, die Anfangswerte.
            assertEquals(false, fragment.getNeedBoolean())
            assertEquals("Parship", fragment.getParshipText())
            assertEquals(Color.RED, fragment.getParshipTextColor())

            // Hier überprüfen wir die Funktionalität des toggle-Buttons
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