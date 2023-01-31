import React from "react";
import { Icon } from "../../atoms/Icon";
import { MyTypography } from "../../atoms/Typography";
import "./index.css";
import {createTheme} from '@mui/material/styles';
import { ThemeProvider } from "@mui/system";

interface Props {
  src: string;
  select?:string;
  content1: string;
  content2: string;
}

const titleTheme= createTheme({
  typography:{
    subtitle1:{
      fontFamily:'sans-serif',
      fontSize:"1rem",
      fontWeight:700
    }
  },
});

const amountTheme= createTheme({
  typography:{
    subtitle1:{
      fontFamily:'sans-serif',
      fontSize:"1rem",
       color:'#7D7D89'
    }
  },
});

export const CryptoCurrency = ({src,content1,content2,...props }: Props) => {
  return (
    <div>
      <div className="crypto">
        <Icon src={src} />
        <img id="select" src={props.select} alt="" />
      <div className="typo">
        <ThemeProvider theme={titleTheme}>
           <MyTypography content={content1} />
        </ThemeProvider>
        <ThemeProvider theme={amountTheme}> 
           <MyTypography content={content2} />
        </ThemeProvider>
      </div>
      </div>
    </div>
  );
};
