package sphere;

public class MultiSphere {
    public static void main(String[] args) {
        // Initialize spheres with different diameters
        Sphere sphere1 = new Sphere(2.0);
        Sphere sphere2 = new Sphere(4.5);
        Sphere sphere3 = new Sphere(1.7);

        // Update the diameter of the first sphere
        sphere1.setDiameter(3.14);

        // Print the volume and surface area of the updated spheres
        System.out.println("Sphere 1: Volume=" + sphere1.getVolume() + ", Surface Area=" + sphere1.getSurfaceArea());
        System.out.println("Sphere 2: Volume=" + sphere2.getVolume() + ", Surface Area=" + sphere2.getSurfaceArea());
        System.out.println("Sphere 3: Volume=" + sphere3.getVolume() + ", Surface Area=" + sphere3.getSurfaceArea());

        // Print the spheres' descriptions
        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println(sphere3);
    }
}