class Camera {

    String brand;
    String model;
    int resolution; 
    String lensType;

    public static final String MESSAGE = "This is a Camera object.";

    public Camera(String brand, String model, int resolution, String lensType) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model +
                           ", Resolution: " + resolution + "MP, Lens Type: " + lensType);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Camera canonEOS = new Camera("Canon", "EOS R5", 45, "RF 24-105mm");
        Camera nikonZ = new Camera("Nikon", "Z9", 46, "Nikkor Z 24-70mm");
        Camera sonyAlpha = new Camera("Sony", "Alpha A7 III", 24, "FE 28-70mm");
        Camera fujifilmXT = new Camera("Fujifilm", "X-T4", 26, "XF 18-55mm");
        Camera panasonicLumix = new Camera("Panasonic", "Lumix GH6", 25, "Leica 12-60mm");
        Camera olympusOMD = new Camera("Olympus", "OM-D E-M1", 20, "M.Zuiko 12-40mm");
        Camera leicaM = new Camera("Leica", "M11", 60, "Summicron 50mm");
        Camera goproHero = new Camera("GoPro", "Hero 10", 23, "Fixed Wide-Angle");
        Camera djiOsmo = new Camera("DJI", "Osmo Action 3", 12, "Ultra-Wide");
        Camera hasselbladX = new Camera("Hasselblad", "X2D 100C", 100, "XCD 55mm");

        canonEOS.display();
        nikonZ.display();
        sonyAlpha.display();
        fujifilmXT.display();
        panasonicLumix.display();
        olympusOMD.display();
        leicaM.display();
        goproHero.display();
        djiOsmo.display();
        hasselbladX.display();
    }
}