import React, { useState } from 'react'
import styled from 'styled-components'
import { postBooking } from '../components/BookingsService'

const FormWrapper = styled.form`
  flex: 1;
  display: flex;
  gap: 2rem;
  flex-direction: column;
  justify-content: center;
  width: 400px;
  margin: auto;
  > div {
    display: flex;
    flex-direction: column;
  }
  > div > input {
    height: 40px;
  }
`

const FormContainer = ({addBooking}) => {
  const [formData, setFormData] = useState({
    guest_name: "",
    guest_email: "",
    checked_in: false,
  })

  const onChange = (event) => {
    const newFormData = Object.assign({}, formData);
    newFormData[event.target.name] = event.target.value;
    setFormData(newFormData)
  }

  const onSubmit = (event) => {
    event.preventDefault();
    postBooking(formData).then((data) => {
      addBooking(data)
    })
    // Reset
    setFormData({
      guest_name: "",
      guest_email: "",
      checked_in: false
    })
  }

  return (
    <FormWrapper onSubmit={onSubmit} id="bookings-form">
      <div>
        <label htmlFor="name_input">Guest Name:</label>
        <input 
          placeholder="Enter Guest Name"
          id="name_input"
          type="text"
          name='guest_name'
          onChange={onChange}
          value={formData.guest_name}/>
      </div>
      <div>
        <label htmlFor="email_input">Email:</label>
        <input 
          placeholder="Enter Email Address:"
          id="email_input" 
          type="email"
          name='guest_email'
          onChange={onChange}
          value={formData.guest_email}/>
      </div>
      <div>
        <input 
          id="checked_in" 
          type="checkbox"
          name='checked_in'
          onChange={onChange}
          value={formData.checked_in}/>
        <label htmlFor= "checked_in">Checked in?</label>
      </div>
      <input type="submit" value="Save" id="save" />
    </FormWrapper>
  )
}

export default FormContainer