<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Check if file is uploaded
    if (isset($_FILES['myfile']) && $_FILES['myfile']['error'] == 0) {
        $upload_dir = 'uploads/';
        $filename = basename($_FILES['myfile']['name']);
        $target_file = $upload_dir . $filename;

        // Create uploads directory if it doesn't exist
        if (!is_dir($upload_dir)) {
            mkdir($upload_dir, 0777, true);
        }

        // Move uploaded file to target location
        if (move_uploaded_file($_FILES['myfile']['tmp_name'], $target_file)) {
            echo "✅ File uploaded successfully: $filename";
        } else {
            echo "❌ Error uploading the file.";
        }
    } else {
        echo "⚠️ No file uploaded or there was an upload error.";
    }
}
?>
