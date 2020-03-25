let groceries = [];

const button = document.querySelector('.loadingButton');

function loadGroceries() {

    fetch('assets/data/shopping-list.json')
    .then( (response) => {return response.json();})
    .then( (data) => {
        groceries = data;
        displayGroceries();
        console.log(groceries);
    })
    .catch( (err) => {console.log(err)})

}

function displayGroceries() {

    if ('content' in document.createElement('template')) {

        const list = document.querySelector('ul');

        groceries.forEach( (grocery) => {

            const temp = document.getElementById('shopping-list-item-template').content.cloneNode(true);
            temp.querySelector('li').insertAdjacentHTML('afterbegin', grocery.name);
            console.log(grocery.name);

            if (grocery.completed) {
                const circle = temp.querySelector('.fa-check-circle');
                circle.className += ' completed';
            }
            
            list.appendChild(temp);
        })
    } else {
        console.log('No template support!')
    }
}

button.addEventListener('click', () => {
    loadGroceries();
    button.setAttribute('id', 'disabled');
})