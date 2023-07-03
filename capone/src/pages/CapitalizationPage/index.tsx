import { Box, ButtonGroup, InputAdornment } from "@mui/material";
import React from "react";
import Header from "../../components/molecules/Header";
import NavBar from "../../components/organisms/NavBar";
import PageHeader from "../../components/organisms/PageHeader";
import {
  CHART_DATA,
  NAVBAR_ITEMS,
  boxConfigurations,
} from "../../components/utils/constants";
import SearchIcon from "@mui/icons-material/Search";
import Button from "../../components/atoms/Button";
import TextField from "../../components/atoms/TextField";
import theme from "../../theme/theme";
import downIcon from "../../assets/images/Chevron-down.svg";
import calendar from "../../assets/images/Calendar.svg";
import CapitalizationTable from "../../components/organisms/CapitalizationTable";
import { Typography } from "../../components/atoms/Typography";

const CapitalizationPage = () => {
  return (
    <div>
      <Header />
      <NavBar activeElement={NAVBAR_ITEMS[2].title} />
      <PageHeader title={"Capitalization"} />
      <Box
        display={"flex"}
        paddingLeft={5}
        paddingBottom={2.5}
        paddingRight={5}
        gap={1}
        alignItems={"center"}
        justifyContent={"space-between"}
      >
        <TextField
          placeholder="Search..."
          type="text"
          InputProps={{
            startAdornment: (
              <InputAdornment position="start">
                <SearchIcon />
              </InputAdornment>
            ),
          }}
          sx={{
            width: "363px",
            "& input": {
              height: "28px",
              padding: "2px 12px",
              fontSize: "15px",
            },
          }}
        />
        <ButtonGroup>
          <Button
            variant="outlined"
            size="small"
            sx={{
              color: theme.palette.textColor.lowEmphasis,
              textTransform: "none",
              borderColor: "#DEDFE1",
              height: "32px",
            }}
            endIcon={<img src={downIcon} alt="downIcon" />}
          >
            Last 7 days
          </Button>
          <Button
            variant="outlined"
            size="small"
            sx={{
              color: theme.palette.textColor.lowEmphasis,
              textTransform: "none",
              borderColor: "#DEDFE1",
              height: "32px",
            }}
            startIcon={<img src={calendar} alt="calendar" />}
          >
            May 28-Jun 3
          </Button>
        </ButtonGroup>
      </Box>

      <Box paddingLeft={5} paddingRight={5} paddingBottom={4.3}>
        <Box display="flex" paddingTop={3} gap={"1px"}>
          {boxConfigurations.map((boxConfig, index) => (
            <Box
              key={index}
              width={boxConfig.width}
              height={boxConfig.height}
              bgcolor={boxConfig.bgcolor}
            />
          ))}
        </Box>
        <Box display={"flex"} justifyContent={"space-around"} paddingTop={0.5}>
          {CHART_DATA.map((data, index) => (
            <Typography
              variant="C1"
              color={theme.palette.textColor.lowEmphasis}
              key={index}
            >
              {data}
            </Typography>
          ))}
        </Box>
      </Box>
      <Box>
        <CapitalizationTable />
      </Box>
    </div>
  );
};

export default CapitalizationPage;
