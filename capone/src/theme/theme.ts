import React from "react";
import { createTheme } from "@mui/material";
declare module "@mui/material/styles" {
  interface TypographyVariants {
    H1: React.CSSProperties;
    H2: React.CSSProperties;
    H3: React.CSSProperties;
    H4: React.CSSProperties;
    H5: React.CSSProperties;
    B1: React.CSSProperties;
    B2: React.CSSProperties;
    B3: React.CSSProperties;
    B4: React.CSSProperties;
    B5: React.CSSProperties;
    C1: React.CSSProperties;
    C2: React.CSSProperties;
  }
  interface TypographyVariantsOptions {
    H1: React.CSSProperties;
    H2: React.CSSProperties;
    H3: React.CSSProperties;
    H4: React.CSSProperties;
    H5: React.CSSProperties;
    B1: React.CSSProperties;
    B2: React.CSSProperties;
    B3: React.CSSProperties;
    B4: React.CSSProperties;
    B5: React.CSSProperties;
    C1: React.CSSProperties;
    C2: React.CSSProperties;
  }

  interface EmphasisColors {
    highEmphasis: string;
    mediumEmphasis?: string;
    lowEmphasis: string;
    white?: string;
    grey?: string;
  }

  interface Palette {
    textColor: EmphasisColors;
  }
  interface PaletteOptions {
    textColor: EmphasisColors;
  }
  interface NewColors {
    primary100?: string;
    primary200?: string;
    primary300?: string;
    primary500?: string;
    primary700?: string;
    highEmphasis?: string;
    mediumEmphasis?: string;
    lowEmphasis?: string;
    white?: string;
    grey?: string;
  }
  interface PaletteColor extends NewColors {}
  interface SimplePaletteColorOptions extends NewColors {}
}
declare module "@mui/material/Typography" {
  interface TypographyPropsVariantOverrides {
    H1: true;
    H2: true;
    H3: true;
    H4: true;
    H5: true;
    B1: true;
    B2: true;
    B3: true;
    B4: true;
    B5: true;
    C1: true;
    C2: true;
  }
}
const theme = createTheme({
  typography: {
    fontFamily: "HelveticaNeueRegular",
    H1: {
      fontFamily: "HelveticaNeueBold",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "28px",
      lineHeight: "32px",
    },
    H2: {
      fontFamily: "HelveticaNeueRegular",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "24px",
      lineHeight: "32px",
    },
    H3: {
      fontFamily: "HelveticaNeueRegular",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "22px",
      lineHeight: "28px",
    },
    H4: {
      fontFamily: "HelveticaNeueMedium",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "22px",
      lineHeight: "28px",
    },
    H5: {
      fontFamily: "HelveticaNeueBold",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "22px",
      lineHeight: "28px",
    },
    B1: {
      fontFamily: "HelveticaNeueBold",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "20px",
      lineHeight: "28px",
    },
    B2: {
      fontFamily: "HelveticaNeueMedium",
      fontStyle: "normal",
      // fontWeight: 400,
      // fontSize: "16px",
      lineHeight: "24px",
      fontWeight: 500,
      fontSize: "20px",
    },
    B3: {
      fontFamily: "HelveticaNeueRegular",
      fontStyle: "normal",
      fontWeight: 400,
      // fontSize: "14px",
      // lineHeight: "20px",
      fontSize: "16px",
      lineHeight: "22px",
    },
    B4: {
      fontFamily: "HelveticaNeueMedium",
      fontStyle: "normal",
      // fontWeight: 400,
      // fontSize: "14px",
      // lineHeight: "20px",
      fontWeight: 500,
      fontSize: "17px",
      lineHeight: "20px",
    },
    B5: {
      fontFamily: "HelveticaNeueMedium",
      fontStyle: "normal",
      fontWeight: 500,
      fontSize: "14px",
      lineHeight: "20px",
    },
    C1: {
      fontFamily: "HelveticaNeueRegular",
      fontStyle: "normal",
      fontWeight: 400,
      // fontSize: "12px",
      // lineHeight: "18px",
      fontSize: "14px",
      lineHeight: "18px",
    },
    C2: {
      fontFamily: "HelveticaNeueMedium",
      fontStyle: "normal",
      fontWeight: 500,
      // fontSize: "11px",
      // lineHeight: "20px",
      fontSize: "13px",
      lineHeight: "20px",
    },
  },
  palette: {
    primary: {
      main: "#E7E6FA",
      primary100: "#E7E6FA",
      primary200: "#BFBBFA",
      primary300: "#857FFA",
      primary500: "#625AFA",
      primary700: "#453DD9",
    },
    textColor: {
      highEmphasis: "#1A1B25",
      mediumEmphasis: "#414552",
      lowEmphasis: "#6A7383",
      white: "#FFFFFF",
      grey: "#A3ACBA",
    },
  },
});
export default theme;
