#!/bin/bash
# Run script for Prison Management System

echo "Starting Prison Management System..."

# Set JavaFX path (adjust based on your JavaFX installation)
# Users should download JavaFX SDK and update PATH_TO_FX

java --module-path $PATH_TO_FX \
    --add-modules javafx.controls,javafx.fxml \
    -cp out/production \
    com.prison.PrisonManagementApp
