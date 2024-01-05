# Super-enhanched-gemoetry-calculator
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperEnhancedGeometryCalculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SuperEnhancedGeometryCalculator::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Super Enhanced Geometry Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Use a more visually appealing layout manager
        JPanel contentPane = new JPanel(new BorderLayout());
        frame.setContentPane(contentPane);

        // Add a header with a title
        JLabel headerLabel = new JLabel("Super Enhanced Geometry Calculator", JLabel.CENTER);
        headerLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
        contentPane.add(headerLabel, BorderLayout.NORTH);

        // Add a logo or graphics
        ImageIcon logoIcon = new ImageIcon("hii.jpg");
        JLabel logoLabel = new JLabel(logoIcon);
        contentPane.add(logoLabel, BorderLayout.SOUTH);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Perimeter", createPerimeterTab());
        contentPane.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
        tabbedPane.addTab("base Surface Area of pyramid", createSurfaceAreaTab());
        tabbedPane.addTab("Volume of cone", createVolumeTab());
        tabbedPane.addTab("Area of rectangle", createAreaTab());
        tabbedPane.addTab("Circumference", createCircumferenceTab());
        tabbedPane.addTab("Circle Area", createCircleAreaTab());
        tabbedPane.addTab("Triangle Area", createTriangleAreaTab());
        tabbedPane.addTab("Probability", createProbabilityTab());
        tabbedPane.addTab("Mean", createMeanTab());
        tabbedPane.addTab("Standard Deviation", createStandardDeviationTab());
        tabbedPane.addTab("Area of trapzoid", createTrapezoidAreaTab());
        tabbedPane.addTab("Volume of sphere", createSphereVolumeTab());
        tabbedPane.addTab("Quad eq", createQuadraticFormulaTab());
        tabbedPane.addTab("Hexagon Area", createHexagonAreaTab());
        tabbedPane.addTab("Parallelogram Area", createParallelogramAreaTab());

        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }



    private static JPanel createSquareAreaTab() {
    // Panel for calculating the area of a square
    JPanel panel = new JPanel(new GridLayout(3, 2));

    JLabel lblSide = new JLabel("Side:");
    JTextField tfSide = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double side = Double.parseDouble(tfSide.getText());

                double squareArea = squareArea(side);
                JOptionPane.showMessageDialog(panel, "Square Area: " + squareArea);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter a valid number for the side.");
            }
        }

        private double squareArea(double side) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });

    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfSide.setText("");
        }
    });

    panel.add(lblSide);
    panel.add(tfSide);
    panel.add(btnCalculate);
    panel.add(btnClear);

    return panel;
}
    
    private static JPanel createCylinderVolumeTab() {
    // Panel for calculating the volume of a cylinder
    JPanel panel = new JPanel(new GridLayout(4, 2));

    JLabel lblRadius = new JLabel("Radius:");
    JTextField tfRadius = new JTextField();
    JLabel lblHeight = new JLabel("Height:");
    JTextField tfCylinderHeight = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double radius = Double.parseDouble(tfRadius.getText());
                double height = Double.parseDouble(tfCylinderHeight.getText());

                double cylinderVolume = cylinderVolume(radius, height);
                JOptionPane.showMessageDialog(panel, "Cylinder Volume: " + cylinderVolume);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter valid numbers for radius and height.");
            }
        }

        private double cylinderVolume(double radius, double height) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });

    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfRadius.setText("");
            tfCylinderHeight.setText("");
        }
    });

    panel.add(lblRadius);
    panel.add(tfRadius);
    panel.add(lblHeight);
    panel.add(tfCylinderHeight);
    panel.add(btnCalculate);
    panel.add(btnClear);

    return panel;
}
    
    private static JPanel createPerimeterTab() {
        // Panel for calculating the perimeter of a triangle
        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel lblSideA = new JLabel("Side A:");
        JTextField tfSideA = new JTextField();
        JLabel lblSideB = new JLabel("Side B:");
        JTextField tfSideB = new JTextField();
        JLabel lblSideC = new JLabel("Side C:");
        JTextField tfSideC = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sideA = Double.parseDouble(tfSideA.getText());
                    double sideB = Double.parseDouble(tfSideB.getText());
                    double sideC = Double.parseDouble(tfSideC.getText());

                    double perimeter = perimeter(sideA, sideB, sideC);
                    JOptionPane.showMessageDialog(panel, "Perimeter: " + perimeter);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for side lengths.");
                }
            }
        });

        panel.add(lblSideA);
        panel.add(tfSideA);
        panel.add(lblSideB);
        panel.add(tfSideB);
        panel.add(lblSideC);
        panel.add(tfSideC);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createSurfaceAreaTab() {
        // Panel for calculating the surface area of a triangle
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblBase = new JLabel("Base:");
        JTextField tfBase = new JTextField();
        JLabel lblHeight = new JLabel("Height:");
        JTextField tfHeight = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(tfBase.getText());
                    double height = Double.parseDouble(tfHeight.getText());

                    double surfaceArea = surfaceArea(base, height);
                    JOptionPane.showMessageDialog(panel, "Surface Area: " + surfaceArea);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for base and height.");
                }
            }
        });

        panel.add(lblBase);
        panel.add(tfBase);
        panel.add(lblHeight);
        panel.add(tfHeight);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createVolumeTab() {
        // Panel for calculating the volume of a cone
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblBase = new JLabel("Base Radius:");
        JTextField tfBaseRadius = new JTextField();
        JLabel lblHeight = new JLabel("Height:");
        JTextField tfHeight = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double baseRadius = Double.parseDouble(tfBaseRadius.getText());
                    double height = Double.parseDouble(tfHeight.getText());

                    double volume = volume(baseRadius, height);
                    JOptionPane.showMessageDialog(panel, "Volume: " + volume);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for base radius and height.");
                }
            }
        });

        panel.add(lblBase);
        panel.add(tfBaseRadius);
        panel.add(lblHeight);
        panel.add(tfHeight);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createAreaTab() {
        // Panel for calculating the area of a rectangle
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblLength = new JLabel("Length:");
        JTextField tfLength = new JTextField();
        JLabel lblWidth = new JLabel("Width:");
        JTextField tfWidth = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(tfLength.getText());
                    double width = Double.parseDouble(tfWidth.getText());

                    double area = area(length, width);
                    JOptionPane.showMessageDialog(panel, "Area: " + area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for length and width.");
                }
            }
        });

        panel.add(lblLength);
        panel.add(tfLength);
        panel.add(lblWidth);
        panel.add(tfWidth);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createCircumferenceTab() {
        // Panel for calculating the circumference of a circle
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel lblRadius = new JLabel("Radius:");
        JTextField tfRadius = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(tfRadius.getText());

                    double circumference = circumference(radius);
                    JOptionPane.showMessageDialog(panel, "Circumference: " + circumference);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter a valid number for the radius.");
                }
            }
        });

        panel.add(lblRadius);
        panel.add(tfRadius);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createCircleAreaTab() {
        // Panel for calculating the area of a circle
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel lblRadius = new JLabel("Radius:");
        JTextField tfRadius = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(tfRadius.getText());

                    double circleArea = circleArea(radius);
                    JOptionPane.showMessageDialog(panel, "Circle Area: " + circleArea);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter a valid number for the radius.");
                }
            }
        });

        panel.add(lblRadius);
        panel.add(tfRadius);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createTriangleAreaTab() {
        // Panel for calculating the area of a triangle
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblBase = new JLabel("Base:");
        JTextField tfBase = new JTextField();
        JLabel lblHeight = new JLabel("Height:");
        JTextField tfHeight = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(tfBase.getText());
                    double height = Double.parseDouble(tfHeight.getText());

                    double triangleArea = triangleArea(base, height);
                    JOptionPane.showMessageDialog(panel, "Triangle Area: " + triangleArea);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for base and height.");
                }
            }
        });

        panel.add(lblBase);
        panel.add(tfBase);
        panel.add(lblHeight);
        panel.add(tfHeight);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createProbabilityTab() {
        // Panel for calculating probability
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel lblSuccess = new JLabel("Successes:");
        JTextField tfSuccess = new JTextField();
        JLabel lblTotal = new JLabel("Total:");
        JTextField tfTotal = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int successes = Integer.parseInt(tfSuccess.getText());
                    int total = Integer.parseInt(tfTotal.getText());

                    double probability = probability(successes, total);
                    JOptionPane.showMessageDialog(panel, "Probability: " + probability);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for successes and total.");
                }
            }
        });

        panel.add(lblSuccess);
        panel.add(tfSuccess);
        panel.add(lblTotal);
        panel.add(tfTotal);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createMeanTab() {
        // Panel for calculating the mean of three values
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblValue1 = new JLabel("Value 1:");
        JTextField tfValue1 = new JTextField();
        JLabel lblValue2 = new JLabel("Value 2:");
        JTextField tfValue2 = new JTextField();
        JLabel lblValue3 = new JLabel("Value 3:");
        JTextField tfValue3 = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(tfValue1.getText());
                    double value2 = Double.parseDouble(tfValue2.getText());
                    double value3 = Double.parseDouble(tfValue3.getText());

                    double mean = mean(value1, value2, value3);
                    JOptionPane.showMessageDialog(panel, "Mean: " + mean);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for the values.");
                }
            }
        });

        panel.add(lblValue1);
        panel.add(tfValue1);
        panel.add(lblValue2);
        panel.add(tfValue2);
        panel.add(lblValue3);
        panel.add(tfValue3);
        panel.add(btnCalculate);

        return panel;
    }

    private static JPanel createStandardDeviationTab() {
        // Panel for calculating the standard deviation of three values
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel lblValue1 = new JLabel("Value 1:");
        JTextField tfValue1 = new JTextField();
        JLabel lblValue2 = new JLabel("Value 2:");
        JTextField tfValue2 = new JTextField();
        JLabel lblValue3 = new JLabel("Value 3:");
        JTextField tfValue3 = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(tfValue1.getText());
                    double value2 = Double.parseDouble(tfValue2.getText());
                    double value3 = Double.parseDouble(tfValue3.getText());

                    double standardDeviation = standardDeviation(value1, value2, value3);
                    JOptionPane.showMessageDialog(panel, "Standard Deviation: " + standardDeviation);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid numbers for the values.");
                }
            }
        });

        panel.add(lblValue1);
        panel.add(tfValue1);
        panel.add(lblValue2);
        panel.add(tfValue2);
        panel.add(lblValue3);
        panel.add(tfValue3);
        panel.add(btnCalculate);

        return panel;
    }
    
    private static JPanel createTrapezoidAreaTab() {
    // Panel for calculating the area of a trapezoid
    JPanel panel = new JPanel(new GridLayout(5, 2));

    JLabel lblBase1 = new JLabel("Base 1:");
    JTextField tfBase1 = new JTextField();
    JLabel lblBase2 = new JLabel("Base 2:");
    JTextField tfBase2 = new JTextField();
    JLabel lblHeight = new JLabel("Height:");
    JTextField tfHeight = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double base1 = Double.parseDouble(tfBase1.getText());
                double base2 = Double.parseDouble(tfBase2.getText());
                double height = Double.parseDouble(tfHeight.getText());

                double trapezoidArea = trapezoidArea(base1, base2, height);
                JOptionPane.showMessageDialog(panel, "Trapezoid Area: " + trapezoidArea);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter valid numbers for bases and height.");
            }
        }
    });
       panel.add(lblBase1);
    panel.add(tfBase1);
    panel.add(lblBase2);
    panel.add(tfBase2);
    panel.add(lblHeight);
    panel.add(tfHeight);
    panel.add(btnCalculate);

    return panel;
}
    
    private static JPanel createSphereVolumeTab() {
    // Panel for calculating the volume of a sphere
    JPanel panel = new JPanel(new GridLayout(3, 2));

    JLabel lblRadius = new JLabel("Radius:");
    JTextField tfRadius = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double radius = Double.parseDouble(tfRadius.getText());

                double sphereVolume = sphereVolume(radius);
                JOptionPane.showMessageDialog(panel, "Sphere Volume: " + sphereVolume);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter a valid number for the radius.");
            }
        }
    });

    panel.add(lblRadius);
    panel.add(tfRadius);
    panel.add(btnCalculate);

    return panel;
}

private static JPanel createQuadraticFormulaTab() {
    // Panel for solving a quadratic equation using the quadratic formula
    JPanel panel = new JPanel(new GridLayout(5, 2));

    JLabel lblA = new JLabel("Coefficient a:");
    JTextField tfA = new JTextField();
    JLabel lblB = new JLabel("Coefficient b:");
    JTextField tfB = new JTextField();
    JLabel lblC = new JLabel("Coefficient c:");
    JTextField tfC = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(tfA.getText());
                double b = Double.parseDouble(tfB.getText());
                double c = Double.parseDouble(tfC.getText());

                String roots = quadraticFormula(a, b, c);
                JOptionPane.showMessageDialog(panel, "Quadratic Roots: " + roots);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter valid numbers for coefficients.");
            }
        }
    });

    panel.add(lblA);
    panel.add(tfA);
    panel.add(lblB);
    panel.add(tfB);
    panel.add(lblC);
    panel.add(tfC);
    panel.add(btnCalculate);

    return panel;
}

private static JPanel createHexagonAreaTab() {
    // Panel for calculating the area of a regular hexagon
    JPanel panel = new JPanel(new GridLayout(3, 2));

    JLabel lblSide = new JLabel("Side:");
    JTextField tfHexagonSide = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double side = Double.parseDouble(tfHexagonSide.getText());

                double hexagonArea = hexagonArea(side);
                JOptionPane.showMessageDialog(panel, "Hexagon Area: " + hexagonArea);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter a valid number for the side.");
            }
        }
    });

    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfHexagonSide.setText("");
        }
    });

    panel.add(lblSide);
    panel.add(tfHexagonSide);
    panel.add(btnCalculate);
    panel.add(btnClear);

    return panel;
}
private static JPanel createParallelogramAreaTab() {
    JPanel panel = new JPanel(new GridLayout(4, 2));

    JLabel lblBase = new JLabel("Base:");
    JTextField tfBase = new JTextField();
    JLabel lblHeight = new JLabel("Height:");
    JTextField tfHeight = new JTextField();

    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double base = Double.parseDouble(tfBase.getText());
                double height = Double.parseDouble(tfHeight.getText());

                double parallelogramArea = parallelogramArea(base, height);
                JOptionPane.showMessageDialog(panel, "Parallelogram Area: " + parallelogramArea);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter valid numbers for base and height.");
            }
        }
    });

    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfBase.setText("");
            tfHeight.setText("");
        }
    });

    panel.add(lblBase);
    panel.add(tfBase);
    panel.add(lblHeight);
    panel.add(tfHeight);
    panel.add(btnCalculate);
    panel.add(btnClear);

    return panel;
}



 // Mathematical Methods

    private static double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    private static double surfaceArea(double base, double height) {
        return 0.5 * base * height;
    }

    private static double volume(double baseRadius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(baseRadius, 2) * height;
    }

    private static double area(double length, double width) {
        return length * width;
    }

    private static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    private static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    private static double probability(int successes, int total) {
        return (double) successes / total;
    }

    private static double mean(double value1, double value2, double value3) {
        return (value1 + value2 + value3) / 3.0;
    }

    private static double standardDeviation(double value1, double value2, double value3) {
        double mean = mean(value1, value2, value3);
        double squaredDifferenceSum = (Math.pow(value1 - mean, 2) + Math.pow(value2 - mean, 2) + Math.pow(value3 - mean, 2)) / 3.0;
        return Math.sqrt(squaredDifferenceSum);
    }

    private static double squareRoot(double value) {
        return Math.sqrt(value);
    }
    private static double trapezoidArea(double base1, double base2, double height) {
    return 0.5 * (base1 + base2) * height;
}

private static double sphereVolume(double radius) {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
}

private static String quadraticFormula(double a, double b, double c) {
    double discriminant = b * b - 4 * a * c;

    if (discriminant > 0) {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return "Two distinct real roots: Root1 = " + root1 + ", Root2 = " + root2;
    } else if (discriminant == 0) {
        double root = -b / (2 * a);
        return "One real root: Root = " + root;
    } else {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
        return "Complex roots: Root1 = " + realPart + " + " + imaginaryPart + "i, Root2 = " + realPart + " - " + imaginaryPart + "i";
    }
}
   private static double squareArea(double side) {
        return side * side;
    }

    private static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    private static double hexagonArea(double side) {
        return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
    }
    
    private static double parallelogramArea(double base, double height) {
    return base * height;
}


}
