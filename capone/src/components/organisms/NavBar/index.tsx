import React, { useState } from "react";
import { Box, styled } from "@mui/material";
import theme from "../../../theme/theme";
import { NAVBAR_ITEMS } from "../../utils/constants";
import { Typography } from "../../atoms/Typography";
import { useNavigate } from "react-router";

interface NavBarProps {
  activeElement: string;
}

const StyledBox = styled(Box)({
  padding: "2px 10px",
  color: theme.palette.textColor.highEmphasis,
  cursor: "pointer",
  height: "20px",
  display: "flex",

  "&:hover": {
    color: theme?.palette?.textColor?.mediumEmphasis,
  },
  "&.active": {
    backgroundColor: theme.palette.primary.primary500,
    color: theme.palette.textColor.white,
    borderRadius: "40px",
  },
});

const NavBar = (props: NavBarProps) => {
  const [activePage, setActivePage] = useState<string>(props.activeElement);
  const navigate = useNavigate();

  const onClickHandler = (item: { title: any; link: any; }) => {
    setActivePage(item.title);
    if (item.title === "Stakeholders") {
      navigate(item.link);
    }
    if (item.title === "Capitalization") {
      navigate(item.link);
    }
  };
  return (
    <div>
      <Box borderBottom={`1px solid #EBEEF1`} />

      <Box
        display={"flex"}
        alignItems={"center"}
        paddingLeft={5}
        paddingTop={1}
        paddingBottom={1}
      >
        {NAVBAR_ITEMS.map((item) => (
          <StyledBox
            key={item.title}
            className={
              activePage.toLowerCase() === item.title.toLowerCase()
                ? "active"
                : ""
            }
            onClick={() => {
              console.log("navigate");
              onClickHandler(item);
            }}
            data-testid={`sidebar-${item.title}`}
          >
            <Typography variant="B4">{item.title}</Typography>
          </StyledBox>
        ))}
      </Box>
      <Box borderBottom={`1px solid #EBEEF1`} />
    </div>
  );
};

export default NavBar;
