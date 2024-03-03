import java.util.Scanner;

public class MathFormulaSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    handleProbabilityChapter(scanner);
                    break;
                case 2:
                    handleCirclesChapter(scanner);
                    break;
                case 3:
                    handleTrianglesChapter(scanner);
                    break;
                case 4:
                    handleSurfaceAreasAndVolumesChapter(scanner);
                    break;
                case 5:
                    handleGeometryChapter(scanner);
                    break;
                case 6:
                    handlePermutationsAndCombinationsChapter(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Math Formula Solver - Chapters:");
        System.out.println("1. Probability");
        System.out.println("2. Circles");
        System.out.println("3. Triangles");
        System.out.println("4. Surface Areas and Volumes");
        System.out.println("5. Geometry");
        System.out.println("6. Permutations and Combinations");
        System.out.println("7. Exit");
    }

    public static void handleProbabilityChapter(Scanner scanner) {
            while (true) {
                System.out.println("Probability Chapter:");
                System.out.println("1. Calculate Event Probability");
                System.out.println("2. Calculate Complement Probability");
                System.out.println("3. Calculate Union Probability");
                System.out.println("4. Calculate Intersection Probability");
                System.out.println("5. Return to Main Menu");
                System.out.print("Enter your choice (1-5): ");
    
                int choice = scanner.nextInt();
    
                if (choice == 5) {
                    System.out.println("Returning to the main menu.");
                    break;
                }
    
                switch (choice) {
                    case 1:
                        ProbabilityChapter.calculateEventProbability(scanner);
                        break;
                    case 2:
                        ProbabilityChapter.calculateComplementProbability(scanner);
                        break;
                    case 3:
                        ProbabilityChapter.calculateUnionProbability(scanner);
                        break;
                    case 4:
                        ProbabilityChapter.calculateIntersectionProbability(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }

    public static void handleCirclesChapter(Scanner scanner) {
            while(true){
                 System.out.println("Circles Chapter:");
                System.out.println("1. Calculate Area");
                System.out.println("2. Calculate Circumference");
                System.out.println("3. Return to Main Menu");

                int choice = scanner.nextInt();
    
                if (choice == 3) {
                    System.out.println("Returning to the main menu.");
                    break;
                }

                switch (choice) {
                    case 1:
                        CirclesChapter.calculateCircleArea(scanner);
                        break;
                    case 2:
                        CirclesChapter.calculateCircleCircumference(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
    }

    public static void handleTrianglesChapter(Scanner scanner) {
        while(true){
            System.out.println("Triangles Chapter:");
        System.out.println("1. Calculate Triangle Area");
        System.out.println("2. Calculate Triangle Perimeter");
        System.out.println("3. Return to Main Menu");

        int choice = scanner.nextInt();
    
                if (choice == 3) {
                    System.out.println("Returning to the main menu.");
                    break;
                }

                switch (choice) {
                    case 1:
                        TriangleChapter.calculateTriangleArea(scanner);
                        break;
                    case 2:
                        TriangleChapter.calculateTrianglePerimeter(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
        }
    }

    public static void handleSurfaceAreasAndVolumesChapter(Scanner scanner) {
        while(true){
            System.out.println("Surface Areas and Volumes Chapter:");
            System.out.println("1. Calculate Cube Surface Area");
            System.out.println("2. Calculate Sphere Volume");
            System.out.println("3. Return to Main Menu");


        int choice = scanner.nextInt();
    
                if (choice == 3) {
                    System.out.println("Returning to the main menu.");
                    break;
                }

                switch (choice) {
                    case 1:
                        SurfaceAndVolume.calculateCubeSurfaceArea(scanner);
                        break;
                    case 2:
                        SurfaceAndVolume.calculateSphereVolume(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
        }
    }

    public static void handleGeometryChapter(Scanner scanner) {
        while(true){
            System.out.println("Geometry Chapter:");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Triangle Area");
            System.out.println("3. Exit Geometry Chapter");
            int choice = scanner.nextInt();
    
                if (choice == 3) {
                    System.out.println("Returning to the main menu.");
                    break;
                }

                switch (choice) {
                    case 1:
                        Geometry.calculateRectangleArea(scanner);
                        break;
                    case 2:
                        Geometry.calculateTriangleArea(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
    }
    }

    public static void handlePermutationsAndCombinationsChapter(Scanner scanner) {
        while(true){
            System.out.println("Permutations and Combinations Chapter:");
            System.out.println("1. Calculate Permutations");
            System.out.println("2. Calculate Combinations");
            System.out.println("3. Exit Permutations and Combinations Chapter");

            int choice = scanner.nextInt();
    
                if (choice == 3) {
                    System.out.println("Returning to the main menu.");
                    break;
                }

                switch (choice) {
                    case 1:
                        PandC.calculateCombinations(scanner);
                        break;
                    case 2:
                        PandC.calculatePermutations(scanner);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
        }
    }
}

class ProbabilityChapter {
    public static void calculateEventProbability(Scanner scanner) {
        System.out.print("Enter the number of successful outcomes: ");
        double successOutcomes = scanner.nextDouble();
        System.out.print("Enter the total number of possible outcomes: ");
        double totalOutcomes = scanner.nextDouble();
        double eventProbability = successOutcomes / totalOutcomes;
        System.out.println("Probability of the event: " + eventProbability);
    }

    public static void calculateComplementProbability(Scanner scanner) {
        System.out.print("Enter the probability of an event: ");
        double eventProbability = scanner.nextDouble();
        double complementProbability = 1 - eventProbability;
        System.out.println("Complement probability: " + complementProbability);
    }

    public static void calculateUnionProbability(Scanner scanner) {
        System.out.print("Enter the probability of the first event: ");
        double firstEventProbability = scanner.nextDouble();
        System.out.print("Enter the probability of the second event: ");
        double secondEventProbability = scanner.nextDouble();
        double unionProbability = firstEventProbability + secondEventProbability - (firstEventProbability * secondEventProbability);
        System.out.println("Union probability: " + unionProbability);
    }

    public static void calculateIntersectionProbability(Scanner scanner) {
        System.out.print("Enter the probability of the first event: ");
        double firstEventProbability = scanner.nextDouble();
        System.out.print("Enter the probability of the second event: ");
        double secondEventProbability = scanner.nextDouble();
        double intersectionProbability = firstEventProbability * secondEventProbability;
        System.out.println("Intersection probability: " + intersectionProbability);
    }
}


class CirclesChapter {
    public static void calculateCircleArea(Scanner scanner) {
        System.out.println("Enter Radius:");
        Double rad = scanner.nextDouble();
        Double area = Math.PI * rad * rad;
        System.out.println("Area of the cricle is: " +  area);
    }

    public static void calculateCircleCircumference(Scanner scanner) {
        System.out.println("Enter Radius:");
        Double rad = scanner.nextDouble();
        Double Circum  = 2 * Math.PI * rad;
        System.out.println("Circumference of the cricle is: " +  Circum);
    }
}

class TriangleChapter{
    public static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = base * height * 1/2;

        System.out.println("Triangle Area: " + triangleArea);
    }


    public static void calculateTrianglePerimeter(Scanner scanner) {
        System.out.print("Enter the length of side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter the length of side C: ");
        double sideC = scanner.nextDouble();

        double trianglePerimeter = sideA + sideB + sideC;

        System.out.println("Triangle Perimeter: " + trianglePerimeter);
    }
}

class SurfaceAndVolume{
    public static void calculateCubeSurfaceArea(Scanner scanner) {
        System.out.print("Enter the length of a side of the cube: ");
        double sideLength = scanner.nextDouble();

        double cubeSurfaceArea = 6 * sideLength * sideLength;;

        System.out.println("Cube Surface Area: " + cubeSurfaceArea);
    }

    public static void calculateSphereVolume(Scanner scanner) {
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double sphereVolume =  (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Sphere Volume: " + sphereVolume);
    }
}

class Geometry{
    public static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;

        System.out.println("Rectangle Area: " + rectangleArea);
    }

    public static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = base * height * 1/2;

        System.out.println("Triangle Area: " + triangleArea);
    }
}

class PandC{
    public static void calculatePermutations(Scanner scanner) {
        System.out.print("Enter n (total items): ");
        int n = scanner.nextInt();

        System.out.print("Enter r (number of items to choose): ");
        int r = scanner.nextInt();

        long permutations = calculatePermutationsFormula(n, r);

        System.out.println("Permutations: " + permutations);
    }

    public static void calculateCombinations(Scanner scanner) {
        System.out.print("Enter n (total items): ");
        int n = scanner.nextInt();

        System.out.print("Enter r (number of items to choose): ");
        int r = scanner.nextInt();

        long combinations = calculateCombinationsFormula(n, r);

        System.out.println("Combinations: " + combinations);
    }

    public static long calculatePermutationsFormula(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            return 0;
        }

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
    }

    public static long calculateCombinationsFormula(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            return 0;
        }

        long numerator = calculatePermutationsFormula(n, r);
        long denominator = calculatePermutationsFormula(r, r);

        return numerator / denominator;
    }
}