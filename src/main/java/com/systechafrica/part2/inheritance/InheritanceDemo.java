package com.systechafrica.part2.inheritance;

import com.systechafrica.part2.inheritance.companysetup.QualityAssurance;
import com.systechafrica.part2.inheritance.companysetup.SoftwareEngineer;
import java.util.logging.Logger;

public class InheritanceDemo {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();
        /*
         * LOGGER.info("app => " + app.hashCode());
         * LOGGER.info("app => " + app.toString());
         * LOGGER.info("app => " + app.getClass().getPackageName());
         */
        app.companySetup();

    }

    public void companySetup() {
        SoftwareEngineer e1 = new SoftwareEngineer("Emily",
                "001", "Nakawa - Kampala", "Software Engineer");

        LOGGER.info("SoftwareEngineer => " + e1.toString());

        QualityAssurance qa = new QualityAssurance("002", "Halkano",
                "Westlands - Nairobi", "Software Engineer in Test");

        LOGGER.info("QualityAssurance qa1 => " + qa.toString());

    }
    /*
     * public void companySetup() {
     * SoftwareEngineer e1 = new SoftwareEngineer();
     * e1.setEmployeeName("Emily");
     * e1.setEmployeeNo("001");
     * e1.setEmployeeAddress("Nakawa - Kampala");
     * e1.setTitle("Software Engineer");
     * LOGGER.info("SoftwareEngineer => " + e1.toString());
     * 
     * QualityAssurance qa = new QualityAssurance();
     * qa.setEmployeeName("Halkano");
     * qa.setEmployeeNo("002");
     * qa.setEmployeeAddress("Westlands - Nairobi");
     * qa.setTitle("Software Engineer in Test");
     * 
     * QualityAssurance qa2 = new QualityAssurance();
     * qa2.setEmployeeName("Annliza");
     * qa2.setEmployeeNo("003");
     * qa2.setEmployeeAddress("Westlands - Nairobi");
     * qa2.setTitle("Software Engineer in Test");
     * LOGGER.info("QualityAssurance qa1 => " + qa.toString());
     * LOGGER.info("QualityAssurance qa2 => " + qa2.toString());
     * 
     * }
     */
}
