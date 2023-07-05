import React, { useState } from "react";
import { Backdrop, Box, styled } from "@mui/material";
import { Typography } from "../../atoms/Typography";
import theme from "../../../theme/theme";
import KeyboardArrowDownOutlinedIcon from "@mui/icons-material/KeyboardArrowDownOutlined";
import {
  STAKEHOLDER_BUTTON_TEXTS,
  STAKEHOLDER_PROPERTIES,
} from "../../utils/constants";
import Button from "../../atoms/Button";
import StakeholderDetailsCard from "../StakeholderDetailsCard";

interface DropdownProps {
  top?: string;
  right?: string;
  left?: string;
}

const StyledBox = styled(Box)({
  color: theme.palette.textColor.white,
  backgroundColor: theme.palette.primary.primary500,
  display: "flex",
  alignItems: "center",
  padding: "4px 8px",
  border: "1px",
  borderRadius: "4px",
  width: "182px",
  height: "28px",
  gap: 8,
});

const Dropdown = (props: DropdownProps) => {
  const [popUp, setPopUp] = useState(false);
  const [addStakeholder, setAddStakeholder] = useState(false);

  const handleClick = () => {
    setPopUp(!popUp);
  };

  const handleButtonClick = (button: string) => {
    if (button === "Add stakeholder") {
      setPopUp(!popUp);
      setAddStakeholder(true);
    }
  };

  return (
    <>
      <StyledBox>
        <Typography variant="B3">Manage Stakeholders</Typography>
        <div style={{ cursor: "pointer" }} onClick={handleClick}>
          <KeyboardArrowDownOutlinedIcon />
        </div>
      </StyledBox>
      {popUp && (
        <Box
          style={{
            position: "absolute",
            top: props.top,
            right: props.right,
            left: props.left,
            backgroundColor: "#ffffff",
            width: "241px",
            height: "293px",
            borderRadius: "6px",
            boxShadow: "1px 3px 4px rgba(0, 0, 0, 0.3)",
          }}
          data-testid="dropdown-menu"
        >
          <Box paddingLeft={"10px"} paddingTop={"1px"} paddingBottom={"1px"}>
            {STAKEHOLDER_BUTTON_TEXTS.map((action) => (
              <Button
                variant="text"
                key={action}
                sx={{
                  color: theme.palette.primary.primary500,
                  textTransform: "none",
                }}
                onClick={() => handleButtonClick(action)}
              >
                {action}
              </Button>
            ))}

            <div style={{ border: "1px solid #EBEEF1" }} />
            <Typography
              variant="C1"
              color={theme.palette.textColor.grey}
              paddingLeft="10px"
            >
              STAKEHOLDER PROPERTIES
            </Typography>
            {STAKEHOLDER_PROPERTIES.map((action) => (
              <Button
                variant="text"
                key={action}
                sx={{
                  color: theme.palette.primary.primary500,
                  textTransform: "none",
                }}
              >
                {action}
              </Button>
            ))}
          </Box>
        </Box>
      )}
      {addStakeholder && (
        <Backdrop open={true} sx={{ zIndex: 1, backgroundColor: "#C0C8D2A6" }}>
          <Box position="absolute" top="9rem" left="33rem">
            <StakeholderDetailsCard onClose={()=>setAddStakeholder(false)} add />
          </Box>
        </Backdrop>
      )}
    </>
  );
};

export default Dropdown;
