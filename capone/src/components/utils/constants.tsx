import theme from "../../theme/theme";

export const tableData = [
  {
    id: 1,
    stakeHolder: "Audrey Simmmons",
    portfolioEmail: "ckctm12@gmail.com",
    contactEmail: "caringgene@aol.com",
    relationship: "Ex-employee",
    costCenter: "Product",
    ownership: "-",
  },
  {
    id: 2,
    stakeHolder: "Kris Roher",
    portfolioEmail: "tranthuy.nute@gmail.com",
    contactEmail: "hahiss@gmail.com",
    relationship: "Employee",
    costCenter: "Account management",
    ownership: "2%",
  },
  {
    id: 3,
    stakeHolder: "Chris Nhat",
    portfolioEmail: "binhan628@gmail.com",
    contactEmail: "sopwith@outlook.com",
    relationship: "-",
    costCenter: "-",
    ownership: "-",
  },
  {
    id: 4,
    stakeHolder: "Harry Peter",
    portfolioEmail: "manhhachkt08@gmail.com",
    contactEmail: "kassiesa@sbcglobal.net",
    relationship: "Ex-employee",
    costCenter: "Marketing",
    ownership: "16%",
  },
  {
    id: 5,
    stakeHolder: "George Harrington",
    portfolioEmail: "nvt.isst.nute@gmail.com",
    contactEmail: "phyruxus@optonline.net",
    relationship: "Employee",
    costCenter: "R&D",
    ownership: "14%",
  },
  {
    id: 6,
    stakeHolder: "Teddy Gibbs",
    portfolioEmail: "danghoang87hl@gmail.com",
    contactEmail: "sammiwierd@att.net",
    relationship: "Employee",
    costCenter: "G&A",
    ownership: "4%",
  },
  {
    id: 7,
    stakeHolder: "Ahmad Pasrand",
    portfolioEmail: "vuhaithuongnute@gmail.com",
    contactEmail: "desplayer@sbcglobal.net",
    relationship: "-",
    costCenter: "-",
    ownership: "-",
  },
  {
    id: 8,
    stakeHolder: "Jame Radley",
    portfolioEmail: "trungkienspktnd@gamail.com",
    contactEmail: "senseobvious@optonline.net",
    relationship: "Employee",
    costCenter: "Account management",
    ownership: "10%",
  },
  {
    id: 9,
    stakeHolder: "Antwan Denny",
    portfolioEmail: "thuhang.nute@gmail.com",
    contactEmail: "alfred@icloud.com",
    relationship: "Employee",
    costCenter: "Marketing",
    ownership: "8%",
  },
];

export const tableHeaders = [
  "STAKEHOLDER",
  "PORTFOLIO EMAIL",
  "CONTACT EMAIL",
  "RELATIONSHIP",
  "COST CENTER",
  "OWNERSHIP",
];

export const NAVBAR_ITEMS = [
  {
    title: "Company",
    link: "",
  },
  {
    title: "Securities",
    link: "",
  },
  {
    title: "Capitalization",
    link: "/capitalization",
  },
  {
    title: "Stakeholders",
    link: "/stakeholders",
  },
  {
    title: "Transactions",
    link: "",
  },
  {
    title: "Compliance",
    link: "",
  },
  {
    title: "Board",
    link: "",
  },
];

export const STAKEHOLDER_BUTTON_TEXTS = [
  "Add stakeholder",
  "Add bulk stakeholders",
  "Update bulk stakeholders",
  "Import payroll data",
];

export const STAKEHOLDER_PROPERTIES = [
  "Add custom properties",
  "Update properties",
];

export const CAPITALIZATION_HEADERS = [
  "OUTSTANDING",
  "OWNERSHIP",
  "FULLY DILUTED",
  "OWNERSHIP",
];

export const CAPITALIZATION_ROWDATA = [
  {
    id: 1,
    color: theme.palette.primary.primary500,
    title: "Common",
    col1: "22 certificates",
    col2: "$756,855 raised",
    col3: "1,000,000 authorized",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
  {
    id: 2,
    color: theme.palette.primary.primary200,
    title: "Series C Prefered",
    col1: "10 certificates",
    col2: "$136,855 raised",
    col3: "1,000,000 authorized",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
  {
    id: 3,
    color: theme.palette.primary.primary200,
    title: "Series A Prefered",
    col1: "32 certificates",
    col2: "$856,855 raised",
    col3: "",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
  {
    id: 4,
    color: theme.palette.primary.primary200,
    title: "Series B Prefered",
    col1: "12 certificates",
    col2: "$156,855 raised",
    col3: "1,000,000 authorized",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
  {
    id: 5,
    color: theme.palette.primary.primary100,
    title: "Outstanding",
    col1: "42 certificates",
    col2: "$656,455 raised",
    col3: "",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
  {
    id: 6,
    color: theme.palette.primary.primary200,
    title: "Series D Prefered",
    col1: "04 certificates",
    col2: "$556,855 raised",
    col3: "1,000,000 authorized",
    outstanding: "5,350,812",
    ownership1: "33.289%",
    fullyDiluted: "5,350,812",
    ownership2: "25.934%",
  },
];

export const boxConfigurations = [
  {
    width: "381px",
    height: "16px",
    bgcolor: theme.palette.primary.primary300,
  },
  {
    width: "280px",
    height: "16px",
    bgcolor: theme.palette.primary.primary200,
  },
  {
    width: "280px",
    height: "16px",
    bgcolor: theme.palette.primary.primary200,
  },
  {
    width: "280px",
    height: "16px",
    bgcolor: theme.palette.primary.primary200,
  },
  {
    width: "280px",
    height: "16px",
    bgcolor: theme.palette.primary.primary200,
  },
  {
    width: "380px",
    height: "16px",
    bgcolor: theme.palette.primary.primary100,
  },
];

export const CHART_DATA = [
  "25.93% common",
  "17.60% Series A",
  "14.68% Series B",
  "16.68% Series C",
  "18.68% Series D",
  "30.93% Outstanding",
];
