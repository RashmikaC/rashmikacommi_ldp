import React from "react";
import { Typography } from "@mui/material";

export const MuiTypography = () => {
  return (
    <div>
      <Typography variant="h1">h1 Heading</Typography>
      <Typography variant="h2">h2 Heading</Typography>
      <Typography variant="h3">h3 Heading</Typography>
      <Typography variant="h4" component="h1" gutterBottom>h4 Heading</Typography>
      <Typography variant="h5">h5 Heading</Typography>
      <Typography variant="h6">h6 Heading</Typography>

      <Typography variant="subtitle1">Subtitle 1</Typography>
      <Typography variant="subtitle2">Subtitle 2</Typography>

      <Typography variant="body1">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsa corrupti
        fugiat culpa ullam provident deserunt a ex inventore. Impedit
        consequuntur quod at asperiores eos fuga numquam quidem animi. Ratione,
        consequuntur?
      </Typography>
      {/* body1 is default */}
      <Typography variant="body2">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos aliquam
        eligendi maxime officia. Tempora voluptatibus beatae veritatis
        repudiandae, quae fugit in aliquam rem velit autem nobis quo quos ex
        facilis!
      </Typography>
    </div>
  );
};
