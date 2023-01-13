// 1. Which event will be dispaching the event?
// (eg. document)
// 2. Which event should we listen for?
// (eg. 'DOMContentLoaded')
// 3. Which pieve of code should run when the event is dispached?
// (eg. callback)

document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');
// ##############################################################
// Handle button click
  const handleButtonClick = function() {
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'That button has definitely been clicked';
  }

  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick); // we don't put () here because we want this funtion to execute later
// ###############################################################

// ###############################################################
// Handle input
  const handleInput = function(event) {
    const resultParagraph = document.querySelector('#input-result');
    resultParagraph.textContent = `You typed: ${event.target.value}`;
  }

  const textInput = document.querySelector('#input');
  textInput.addEventListener('input', handleInput);
// ###############################################################

// ###############################################################
// Handle select
  const handleSelectChange = function(event) {
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `You selected ${event.target.value}`;
  }

  const select = document.querySelector('#select');
  select.addEventListener('change', handleSelectChange)
// ###############################################################

// ###############################################################
//Handle form submit
  const handleFormSubmit = function(event) {
    event.preventDefault();
    const resultParagraph = document.querySelector('#form-result');
    resultParagraph.textContent = `
    Your name: 
    ${event.target.first_name.value}
    ${event.target.last_name.value}
    `
  }

  const form = document.querySelector('#form')
  form.addEventListener('submit', handleFormSubmit);


});
