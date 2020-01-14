package com.java.report;

import java.util.ArrayList;
import java.util.List;

public class ReportRunner {
    public static void main(String[] args) {
        List<Report> list = new ArrayList();

        FinanceReport financeReport = new FinanceReport();
        HealthReport healthReport = new HealthReport();

        list.add(financeReport);
        list.add(healthReport);

        for(Report report : list) {
            report.load();
            report.print();
        }
    }
}
