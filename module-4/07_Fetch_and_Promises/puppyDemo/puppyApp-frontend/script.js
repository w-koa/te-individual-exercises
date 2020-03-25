let puppies = [];
document.addEventListener('DOMContentLoaded', prepPage);

function prepPage() {

   const loadBtn = document.getElementById('load-btn');
   loadBtn.addEventListener('click', loadThePuppies);
}

function loadThePuppies() {
    

}

function populatePage() {

    const parent = document.getElementById('main');

    puppies.forEach(
        (puppy) => {
            const child = document.createElement('p');
            console.log(puppy);
            child.innerText = `Name: ${puppy.name} | Weight: ${puppy.weight} |  Gender: ${puppy.gender}`;
            parent.appendChild(child);
        }
    );
}