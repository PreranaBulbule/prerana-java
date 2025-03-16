class FaceRunner {
	
    public static void main(String[] args) {
		
        String shape1 = "Oval";
        float eyeSize1 = 2.5f;
        boolean smiling1 = true;
        Face face1 = new Face(shape1, eyeSize1, smiling1);
        System.out.println("Face shape: " + shape1);
        System.out.println("Face eye size: " + eyeSize1);
        System.out.println("Face smiling: " + smiling1);

        String shape2 = "Round";
        float eyeSize2 = 2.8f;
        boolean smiling2 = false;
        Face face2 = new Face(shape2, eyeSize2, smiling2);
        System.out.println("Face shape: " + shape2);
        System.out.println("Face eye size: " + eyeSize2);
        System.out.println("Face smiling: " + smiling2);

        String shape3 = "Square";
        float eyeSize3 = 2.6f;
        boolean smiling3 = true;
        Face face3 = new Face(shape3, eyeSize3, smiling3);
        System.out.println("Face shape: " + shape3);
        System.out.println("Face eye size: " + eyeSize3);
        System.out.println("Face smiling: " + smiling3);

        String shape4 = "Heart";
        float eyeSize4 = 3.0f;
        boolean smiling4 = false;
        Face face4 = new Face(shape4, eyeSize4, smiling4);
        System.out.println("Face shape: " + shape4);
        System.out.println("Face eye size: " + eyeSize4);
        System.out.println("Face smiling: " + smiling4);

        String shape5 = "Diamond";
        float eyeSize5 = 2.7f;
        boolean smiling5 = true;
        Face face5 = new Face(shape5, eyeSize5, smiling5);
        System.out.println("Face shape: " + shape5);
        System.out.println("Face eye size: " + eyeSize5);
        System.out.println("Face smiling: " + smiling5);
    }
}