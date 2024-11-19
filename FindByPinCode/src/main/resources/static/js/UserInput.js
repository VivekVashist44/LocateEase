/*document.addEventListener('DOMContentLoaded', function() {
    document.querySelector('form').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent form submission

        var pinLocation = document.getElementById('pinLocation').value.trim();

        // Check if the input is empty
        if (!pinLocation) {
            alert('Please enter a PIN number or location.');
            return;
        }

        // Redirect to the dashboard page
        window.location.href = "ShowAminities.html";
    });
});

document.addEventListener('DOMContentLoaded', function() {
    document.querySelector("form").addEventListener("submit", async function(event) {
        event.preventDefault(); // Prevent form submission

        var pinCode = document.getElementById('pinLocation').value.trim();

        // Check if the input is empty
        if (!pinCode) {
            alert('Please enter a PIN number or location.');
            return;
        }

        // Construct the URL with pinLocation as a query parameter
        var url = `http://localhost:8080/pin/${pinCode}`;

        // Send a GET request to the API endpoint
       await fetch(url, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            // Handle the response data
            console.log('Success:', data);

            // Example: Process the response and handle it as needed
            if (data.Status === 'Success' && data.PostOffice && data.PostOffice.length > 0) {
                // Do something with the data, e.g., display it
                // Example: Redirect to a page or update the UI
                window.location.href = "ShowAminities.html";
            } else {
                alert('No data found for the provided PIN code.');
            }
        })
        .catch((error) => {
            console.error('Error:', error);
            alert(`An error occurred with PIN location: ${pinCode}. Please try again.`);
        });
    });
});
*/
document.addEventListener('DOMContentLoaded', function() {
    console.log('DOM fully loaded and parsed');
    // Your existing code here
});
document.addEventListener('DOMContentLoaded', function() {
    document.querySelector("form").addEventListener("submit", async function(event) {
        event.preventDefault(); // Prevent form submission

        var pinCode = document.getElementById('pinLocation').value.trim();

        // Check if the input is empty
        if (!pinCode) {
            alert('Please enter a PIN number or location.');
            return;
        }

        // Construct the URL with pinLocation as a query parameter
        var url = `http://localhost:8080/pin/${pinCode}`;

        // Send a GET request to the API endpoint
        await fetch(url, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
			
        })
        .then(data => {
            // Handle the response data
            console.log('Success:', data);

            // Example: Redirect to the ShowAminities.html with PIN code
            if (data.Status === 'Success' && data.PostOffice && data.PostOffice.length > 0) {
                // Redirect to ShowAminities.html with PIN code
				window.location.href = `/ShowAminities.html?pin=${pinCode}`;
            } else {
				
                alert('No data found for the provided PIN code.');
            }
        })
        .catch((error) => {
            console.error('Error:', error);
            alert(`An error occurred with PIN location: ${pinCode}. Please try again.`);
        });
    });
});
