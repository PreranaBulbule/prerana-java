class Hospital {
    void checkup(String patientName, int age, String mobile, String email, String sickness) {
        System.out.println("Hospital checks up " + patientName + " for " + sickness);
        Doctor doctor = new Doctor();
        doctor.treatment(patientName, age);
    }
}