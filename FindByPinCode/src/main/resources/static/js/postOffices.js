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
        fetch(`http://localhost:8080/pin/${pinCode}/getAllPostOffice`)
            .then(response => response.json())
            .then(data => {
                if (data && data.length > 0) {
                    console.log('Post Offices:', data);
                    populateTable(data);
                } else {
                    alert('No data found for the provided PIN code.');
                }
            })
            .catch(error => {
                console.error('Error fetching post office data:', error);
                alert('An error occurred while fetching post office data. Please try again.');
            });
    } else {
        alert('No PIN code provided in the URL.');
    }

    function populateTable(data) {
        const tableBody = document.getElementById('postOfficesTableBody');
        tableBody.innerHTML = ''; // Clear existing content

        data.forEach(postOffice => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${postOffice.Name || 'N/A'}</td>
                <td>${postOffice.State || 'State not available'}</td>
                <td>${postOffice.District || 'District not available'}</td>
            `;
            tableBody.appendChild(row);
        });

        // Initialize DataTable after populating the table body
        $('#postOfficesTable').DataTable();
    }
});
