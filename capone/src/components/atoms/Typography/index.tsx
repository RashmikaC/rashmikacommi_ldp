import React from "react";
import { Typography as MuiTypography, TypographyProps } from "@mui/material";

export interface CustomTypographyProps extends TypographyProps {
  color?: string;
}

export const Typography = (props: CustomTypographyProps) => {
  const { color, ...restProps } = props;
  const typographyStyle = {
    ...(color && { color }),
  };

  return <MuiTypography {...restProps} sx={typographyStyle} />;
};
