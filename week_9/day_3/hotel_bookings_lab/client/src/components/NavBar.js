import { Link } from 'react-router-dom'
import styled from 'styled-components'

const NavBarContainer = styled.div`
  display: flex;
  justify-content: space-between;
  gap: 2rem;
  flex-wrap: wrap;
  align-items: center;
  background-color: #B42318;
  padding: 1rem;
  > h1{
    min-width: 280px;
    margin-block: 8px;
    color: #fff;
    font-size: 50px;
    font-family: calamity;
  }
  > div {
    min-width: 280px;
    display: flex;
    gap: 2rem;
  }
`

const StyledLink = styled(Link)`
  text-decoration: none;
  color: white;
  font-size: 20px;
  font-weight: 600;
`

const NavBar = () => {
  return (
    <NavBarContainer>
      <h1>The Beresford Hotel</h1>
      <div>
        <StyledLink to="/">Home</StyledLink>
        <StyledLink to="/create">Add New</StyledLink>
      </div>
    </NavBarContainer>
  )
}

export default NavBar;