import React, {useState, useEffect} from 'react'
import styled from 'styled-components'
import {getBookings, deleteBooking, updateBooking} from '../components/BookingsService';

const BookingsWrapper = styled.div`
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  > ul > li {
    list-style: none;
  }
`

const BookingsContainer = () => {

  const [bookingsState, setBookingsState] = useState([])

  useEffect(() => {
    getBookings().then((allBookings) => {
      setBookingsState(allBookings);
    })
  }, []);

  const removeBooking = (id) => {
    deleteBooking(id).then(() => {
      const temp = [...bookingsState]
      const indexToDel = temp.map(s => s._id).indexOf(id);
      console.log(indexToDel);

      temp.splice(indexToDel, 1);
      setBookingsState(temp)
    })  
    
  }

  const bookingsList = bookingsState.map(booking => {
    return <li>
              <h2>{booking.guest_name}</h2>
              <p>{booking.guest_email}</p>
              <p>Checked In: {booking.checked_in ? '\u2714' : '\u274C'}</p>
              <button onClick={() => removeBooking(booking._id)}>Delete</button>
          </li>
  })

  return (
    <BookingsWrapper>
    <ul>
      {bookingsList}
    </ul>
    </BookingsWrapper>
  ) 
}

export default BookingsContainer