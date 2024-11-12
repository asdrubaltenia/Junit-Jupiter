import org.junit.platform.*;
import org.junit.platform.engine.discovery.ClassNameFilter;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class EjecutorPruebas {
    public static void main(String[] args) {
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);

        launcher.execute(
                LauncherDiscoveryRequestBuilder.request()
                        .selectors(DiscoverySelectors.selectClass(CalculadoraCalificacionesTest.class))
                        .filters(ClassNameFilter.includeClassNamePatterns(".*"))
                        .build()
        );

        TestExecutionSummary resumen = listener.getSummary();
        System.out.println("Resultado de la Prueba: " + (resumen.getFailures().size() == 0 ? "Éxito" : "Fallo"));
    }
}
