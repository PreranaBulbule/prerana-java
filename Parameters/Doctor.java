class Doctor {
    void treatment(String patientName, int age) {
        System.out.println("Doctor treats " + patientName + " (Age: " + age + ")");
        Nurse nurse = new Nurse();
        nurse.assist(patientName);
    }
}
