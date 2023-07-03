import { Box } from "@mui/material";
import React from "react";
import RightIcon from "../../../assets/images/Chevron-right.svg";
import Divider from "../../../assets/images/Divider.svg";
import { Typography } from "../../atoms/Typography";
import theme from "../../../theme/theme";

interface CapitalizationRowProps {
  color?: string;
  title: string;
  col1: string;
  col2: string;
  col3?: string;
  outstanding: string;
  ownership1: string;
  fullyDiluted: string;
  ownership2: string;
}

const CapitalizationRow = (props: CapitalizationRowProps) => {
  return (
    <Box display={"flex"} gap={2} justifyContent={"space-between"} paddingTop={1} paddingBottom={1.4}>
      <Box display="flex">
        <Box
          width={"4px"}
          height={"60px"}
          bgcolor={props.color}
        />
        <Box paddingLeft={2.3} paddingRight={1.7}>
          <img src={RightIcon} alt="rightIcon" />
        </Box>
        <Box display={"flex"} flexDirection={"column"} gap={0.5}>
          <Typography variant="B3">{props.title}</Typography>
          <Box display="flex" gap={1}>
            <Typography variant="C1" color={theme.palette.textColor.grey}>{props.col1}</Typography>
            <img src={Divider} alt="." />

            <Typography variant="C1" color={theme.palette.textColor.grey}>{props.col2}</Typography>
            {props.col3 !== "" ? (
              <>
                <img src={Divider} alt="." />
                <Typography variant="C1" color={theme.palette.textColor.grey}>{props.col3}</Typography>
              </>
            ) : (
              <></>
            )}
          </Box>
        </Box>
      </Box>
      <Box display={"flex"} gap={6}>
        <Typography variant="B3" padding={"8px 8px 8px 20px"} color={theme.palette.textColor.mediumEmphasis}>
          {props.outstanding}
        </Typography>
        <Typography variant="B3" padding={"8px 8px 8px 20px"} color={theme.palette.textColor.mediumEmphasis}>
          {props.ownership1}
        </Typography>
        <Typography variant="B3" padding={"8px 8px 8px 20px"} color={theme.palette.textColor.mediumEmphasis}>
          {props.fullyDiluted}
        </Typography>
        <Typography variant="B3" padding={"8px 8px 8px 20px"} color={theme.palette.textColor.mediumEmphasis}>
          {props.ownership2}
        </Typography>
      </Box>
    </Box>
  );
};

export default CapitalizationRow;
