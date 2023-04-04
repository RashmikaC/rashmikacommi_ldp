import React from "react";
import {Link, Outlet} from 'react-router-dom';

export const Products = () => {
  return (
    <>
      <div>
        <input type="search " placeholder="Search products" />
      </div>
      <nav>
        {/* Relative links(dont start from root, continues with parent link) */}
        <Link to='featured'>Featured</Link>
        <Link to='new'>New</Link>
      </nav>
      <Outlet />
    </>
  );
};
