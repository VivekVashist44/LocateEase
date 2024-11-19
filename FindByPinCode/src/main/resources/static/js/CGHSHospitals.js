document.addEventListener('DOMContentLoaded', function() {
    // Function to get query parameters
    function getQueryParam(param) {
        const urlParams = new URLSearchParams(window.location.search);
        return urlParams.get(param);
    }

    // Get the pinCode from the URL
    const pinCode = getQueryParam('pin');
    console.log("PIN Code:", pinCode);

    if (pinCode) {
        console.log('PIN Code:', pinCode);
        // Use the pinCode to fetch and display relevant data
        fetch(`http://localhost:8080/pin/${pinCode}/CGHSHospital`)
            .then(response => response.json())
            .then(data => {
                console.log("The data is", data);
                if (data.records && data.records.length > 0) {
                    console.log('CGHS Hospitals:', data.records);
                    populateTable(data.records);
                } else {
                    alert('No data found for the provided PIN code.');
                }
            })
            .catch(error => {
                console.error('Error fetching CGHS hospital data:', error);
                alert('An error occurred while fetching CGHS hospital data. Please try again.');
            });
    } else {
        alert('No PIN code provided in the URL.');
    }

    function populateTable(data) {
        const tableBody = document.getElementById('cghsHospitalsTableBody');
        tableBody.innerHTML = ''; // Clear existing content

        data.forEach(hospital => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${hospital.hospitalName || 'N/A'}</td>
                <td>${hospital.hospitalAddress || 'Address not available'}</td>
                <td>${hospital.cityName || 'City not available'}</td>
            `;
            tableBody.appendChild(row);
        });

        // Initialize DataTable after populating the table body
        $('#cghsHospitalsTable').DataTable();
    }
});
