const urlParams = new URLSearchParams(window.location.search);
        const error = urlParams.get('error');
        const success = urlParams.get('success');
     
        if (error === "File is not a PDF") {
            showAlert("File is not a PDF", "error");
        } else if (success === "File upload completed") {
            showAlert("File successfully loaded", "success");
        }

function showAlert(message, type) {
    const alertDiv = document.createElement("div");
    alertDiv.classList.add("alert");
    if (type === "success") {
        alertDiv.classList.add("success");
    }
    alertDiv.textContent = message;
    document.getElementById("container").appendChild(alertDiv);

    setTimeout(function () {
        alertDiv.remove();
    }, 3000);
}