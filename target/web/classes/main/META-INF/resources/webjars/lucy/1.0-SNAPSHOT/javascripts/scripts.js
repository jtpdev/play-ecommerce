function call(uri) {
	window.location = uri;
};

function callByCheck(checkInpt, uri) {
	if(checkInpt.checked){
		window.location = uri;
	}
};

function addQuantity(quantityInput,uri) {
	var quantity = quantityInput.value;
	window.location = uri + "/" + quantity;
};



