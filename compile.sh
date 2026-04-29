#!/bin/bash
# Compile script for Prison Management System

echo "Compiling Prison Management System..."

# Create output directory
mkdir -p out/production

# Find JavaFX path (adjust based on your JavaFX installation)
# For this example, we'll compile without explicit JavaFX module path
# Users should download JavaFX SDK and update this path

# Compile all Java files
javac -d out/production \
    --module-path $PATH_TO_FX \
    --add-modules javafx.controls,javafx.fxml \
    -sourcepath src/main/java \
    $(find src/main/java -name "*.java")

# Copy FXML files to output directory
mkdir -p out/production/fxml
cp -r src/main/resources/fxml/* out/production/fxml/

echo "Compilation complete!"
echo ""
echo "To run the application, use: ./run.sh"
