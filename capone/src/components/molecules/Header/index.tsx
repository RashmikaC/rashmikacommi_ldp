import React from "react";
import CapOne from "../../../assets/images/Logo.svg";
import DownIcon from "../../../assets/images/Chevron-down.svg";
import User from "../../../assets/images/User.svg";
import { Box } from "@mui/material";
import { Typography } from "../../atoms/Typography";
import theme from "../../../theme/theme";

const Header = () => {
  return (
    <div>
      <Box
        display={"flex"}
        paddingTop={1}
        paddingBottom={1}
        bgcolor={"#EBEEF1"}
        alignItems={"center"}
        justifyContent={"space-between"}
      >
        <Box display={"flex"}>
          <Box paddingLeft={5}>
            <img src={CapOne} alt="CapOne" />
          </Box>
          <Box display={"flex"} paddingLeft={2.5} alignItems={"center"}>
            <Typography
              variant="C1"
              color={theme.palette.textColor.lowEmphasis}
            >
              Accounts
            </Typography>
            <Typography
              variant="C1"
              color={theme.palette.textColor.highEmphasis}
              paddingLeft={"8px"}
            >
              Meetly
            </Typography>
            <img src={DownIcon} alt="icon" />
          </Box>
        </Box>
        <Box display={"flex"} alignItems={"center"} gap={1}>
          <Typography variant="C1" color={theme.palette.textColor.highEmphasis}>
            Task
          </Typography>
          <Typography variant="C1" color={theme.palette.textColor.highEmphasis}>
            Downloads
          </Typography>
          <Box paddingRight={5}>
            <img src={User} alt="User" />
          </Box>
        </Box>
      </Box>
    </div>
  );
};

export default Header;
