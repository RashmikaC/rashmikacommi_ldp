import React,{Suspense} from "react";
import { Routes, Route } from "react-router-dom";
// import { About } from "./components/About";
import { AdminUser } from "./components/AdminUser";
import { FeaturedProducts } from "./components/FeaturedProducts";
import { Home } from "./components/Home";
import { Navbar } from "./components/Navbar";
import { NewProducts } from "./components/NewProducts";
import { NoMatch } from "./components/NoMatch";
import { OrderSummary } from "./components/OrderSummary";
import { Products } from "./components/Products";
import { UserDetails } from "./components/UserDetails";
import { Users } from "./components/Users";
const LazyAbout=React.lazy(() => import('./components/About'))

function App() {
  return (
    <>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />}></Route>
        {/* <Route path="about" element={<About />}></Route> */}
        <Route path="about" element={
        <React.Suspense fallback='Loading...'>
          <LazyAbout />
        </React.Suspense>
        }></Route>
        <Route path="order-summary" element={<OrderSummary />} />
        <Route path="products" element={<Products />}>
          <Route index element={<FeaturedProducts />}></Route>
          <Route path="featured" element={<FeaturedProducts />} />
          <Route path="new" element={<NewProducts />} />
        </Route>
        <Route path="users" element={<Users />}>
          {/* <Route path='users/1' element={<UserDetails />} />
        <Route path='users/2' element={<UserDetails />} />
        <Route path='users/3' element={<UserDetails />} /> */}
        {/* url param */}
          <Route path=":userId" element={<UserDetails />} />  
          <Route path="admin" element={<AdminUser />} />
        </Route>
        <Route path="*" element={<NoMatch />} />
      </Routes>
    </>
  );
}

export default App;
