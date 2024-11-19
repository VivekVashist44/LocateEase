document.addEventListener('DOMContentLoaded', function() {
    const urlParams = new URLSearchParams(window.location.search);
    const pinCode = urlParams.get('pin');

	   
    if (!pinCode) {
        alert('No PIN code provided.');
        return;
    }

	const postOfficesCard = document.getElementById('postOfficesCard');
	    if (postOfficesCard) {
	        postOfficesCard.addEventListener('click', function() {
	            window.location.href = `PostOffices.html?pin=${pinCode}`;
	        });
	    } else {
	        console.error('Element with ID "postOfficesCard" not found.');
	    }

	    // Event listener for CGHS Hospitals card
	    const cghsHospitalsCard = document.getElementById('cghsHospitalsCard');
	    if (cghsHospitalsCard) {
	        cghsHospitalsCard.addEventListener('click', function() {
	            window.location.href = `cghsHospitals.html?pin=${pinCode}`;
	        });
	    } else {
	        console.error('Element with ID "cghsHospitalsCard" not found.');
	    }
	});
