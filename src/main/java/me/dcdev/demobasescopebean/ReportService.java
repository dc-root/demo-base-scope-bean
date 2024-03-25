package me.dcdev.demobasescopebean;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ApplicationContext applicationContext;

    public String generateReport() {
        // Obtem uma nova instância de ReportGenerationTask a cada chamada
        ReportGenerationTask reportTask = applicationContext.getBean(ReportGenerationTask.class);
        return reportTask.generateReport();
    }
}
