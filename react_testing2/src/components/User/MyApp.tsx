import React from 'react'
import { Search } from '.';

const getUser = () => {
  return Promise.resolve({ id: '1', name: 'Robin' });
};

export const MyApp = () => {
  const [search, setSearch] = React.useState('');
  const [user, setUser] = React.useState({
    id: '',
    name: ''
});

  React.useEffect(() => {
    const loadUser = async () => {
      for(let i=0;i<90000000;i++)
      {
      }
      const user = await getUser();
      setUser(user);
    };

    loadUser();
  }, []);

  function handleChange(event: { target: { value: React.SetStateAction<string>; }; }) {
    setSearch(event.target.value);
  }

  return (
    <div>
      {user ? <p>Signed in as {user.name}</p> : null}

      <Search value={search} onChange={handleChange}>
        Search:
      </Search>

      <p>Searches for {search ? search : '...'}</p>
    </div>
  );
}