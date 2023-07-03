import {
  Box,
  FormControlLabel,
  InputAdornment,
  RadioGroup,
} from "@mui/material";
import React, { useEffect, useState } from "react";
import axios from "axios";
import theme from "../../../theme/theme";
import { Typography } from "../../atoms/Typography";
import RadioButton from "../../atoms/RadioButton";
import TextField from "../../atoms/TextField";
import UnfoldMoreRoundedIcon from "@mui/icons-material/UnfoldMoreRounded";
import AddIcon from "@mui/icons-material/Add";
import RemoveIcon from "@mui/icons-material/Remove";
import Button from "../../atoms/Button";


interface StakeholderDetailsCardProps {
  onClose: () => void;
  add?: boolean;
  update?: boolean;
  id?:number;
  name?: string;
  email?: string;
  relation?: string;
}

const StakeholderDetailsCard = (props: StakeholderDetailsCardProps) => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [contactEmail, setContactEmail] = useState("");
  const [relationship, setRelationship] = useState("");

  useEffect(() => {
    setFirstName(props.name ? props.name.split(" ")[0] : "");
    setLastName(props.name ? props.name.split(" ")[1] : "");
    setContactEmail(props.email || "");
    setRelationship(props.relation || "");
  }, [props.name, props.email, props.relation]);

  const handleButtonClick = () => {
    const tempStakeholder = {
      stakeHolder: `${firstName} ${lastName}`,
      portfolioEmail: `${contactEmail}`,
      contactEmail: `${contactEmail}`,
      relationship: `${relationship}`,
      costCenter: "-",
      ownership: "-",
    };
    if (props.add) {
      axios
        .post("http://localhost:3001/stakeholders", tempStakeholder)
        .then((response) => {
          console.log("Data saved successfully:", response.data);
        })
        .catch((error) => {
          console.error("Error saving data:", error);
        });
    }
    else{
        axios
        .patch(`http://localhost:3001/stakeholders/${props.id}`, tempStakeholder)
        .then((response) => {
          console.log("Data updated successfully:", response.data);
        })
        .catch((error) => {
          console.error("Error updating data:", error);
        });
    }
    props.onClose();
  };
  return (
    <div
      style={{
        width: "480px",
        height: "574px",
        backgroundColor: theme.palette.textColor.white,
        borderRadius: "8px",
        boxShadow: "0px 4px 8px 0px rgba(16, 24, 64, 0.08)",
        overflowY: "auto",
      }}
    >
      <Box display="flex" flexDirection={"column"} gap={2}>
        <Box
          position="sticky"
          top={0}
          bgcolor={theme.palette.textColor.white}
          zIndex={10}
        >
          <Box
            paddingLeft={3}
            paddingRight={3}
            paddingTop={2}
            paddingBottom={1.5}
            display={"flex"}
            flexDirection={"column"}
          >
            <Typography
              variant="B2"
              color={theme.palette.textColor.mediumEmphasis}
            >
              {props.add && "Add stakeholder"}
              {props.update && "Edit stakeholder"}
            </Typography>
          </Box>
          <div
            style={{
              border: `1px solid #EBEEF1`,
            }}
          />
        </Box>
        <Box paddingLeft={3} paddingRight={3}>
          <Typography variant="B4" color={theme.palette.textColor.highEmphasis}>
            Basic information
          </Typography>

          <Box display="flex" alignItems={"center"} paddingTop={3}>
            <Typography
              variant="B4"
              color={theme.palette.textColor.highEmphasis}
              paddingRight="30px"
            >
              Stakeholder type
              <span style={{ color: "red", marginLeft: "4px" }}>*</span>
            </Typography>
            <RadioGroup row defaultValue="Individual">
              <Box display={"flex"} gap={1.1}>
                <FormControlLabel
                  value="Individual"
                  control={<RadioButton />}
                  label={<Typography variant="B4">Individual</Typography>}
                />
                <FormControlLabel
                  value="Non-individual"
                  control={<RadioButton />}
                  label={<Typography variant="B4">Non-individual</Typography>}
                />
              </Box>
            </RadioGroup>
          </Box>
          <Box display="flex" flexDirection={"column"} paddingTop={3} gap={3}>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                First name
              </Typography>
              <TextField
                fullWidth
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                }}
                value={firstName}
                onChange={(e) => setFirstName(e.target.value)}
                label="First name"
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Last name
              </Typography>
              <TextField
                fullWidth
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                }}
                value={lastName}
                onChange={(e) => setLastName(e.target.value)}
                label="Last name"
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Contact email
              </Typography>
              <TextField
                fullWidth
                type="email"
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                }}
                value={contactEmail}
                onChange={(e) => setContactEmail(e.target.value)}
                label="Contact email"
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                DOB
              </Typography>
              <TextField
                type="date"
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                    width: "125px",
                  },
                  paddingTop: "4px",
                  paddingBottom: "4px",
                }}
              />
            </Box>
          </Box>
        </Box>
        <div
          style={{
            border: `1px solid #EBEEF1`,
          }}
        />
        <Box paddingLeft={3} paddingRight={3}>
          <Typography variant="B4" color={theme.palette.textColor.highEmphasis}>
            Identification information
          </Typography>

          <Box display="flex" flexDirection={"column"} paddingTop={3} gap={3}>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Tax ID
              </Typography>
              <TextField
                fullWidth
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                }}
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Employee ID
              </Typography>
              <TextField
                fullWidth
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                }}
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Payroll ID
              </Typography>
              <TextField
                fullWidth
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                  },
                  paddingTop: "4px",
                  paddingBottom: "4px",
                }}
              />
            </Box>
          </Box>
        </Box>
        <div
          style={{
            border: `1px solid #EBEEF1`,
          }}
        />
        <Box paddingLeft={3} paddingRight={3} paddingBottom={2}>
          <Typography variant="B4" color={theme.palette.textColor.highEmphasis}>
            Relationship information
          </Typography>
          <Box display="flex" paddingTop={3} gap={3} alignItems={"flex-end"}>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Effective date
              </Typography>
              <TextField
                type="date"
                size="small"
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                    width: "125px",
                  },
                  paddingTop: "4px",
                }}
              />
            </Box>
            <Box>
              <Typography
                variant="B3"
                color={theme.palette.textColor.mediumEmphasis}
              >
                Relationship
              </Typography>
              <TextField
                size="small"
                InputProps={{
                  endAdornment: (
                    <InputAdornment position="end">
                      <UnfoldMoreRoundedIcon fontSize="small" />
                    </InputAdornment>
                  ),
                }}
                sx={{
                  "& .MuiInputBase-root": {
                    height: "28px",
                    fontSize: "14px",
                    width: "119px",
                  },
                  paddingTop: "4px",
                }}
                value={relationship}
                onChange={(e) => setRelationship(e.target.value)}
              />
            </Box>
            <Box
              display="flex"
              alignItems="center"
              justifyContent="center"
              width={28}
              height={28}
              border={`1px solid #DEDFE1`}
              borderRadius="4px"
              boxShadow="0px 4px 8px 0px rgba(16, 24, 64, 0.08)"
            >
              <RemoveIcon fontSize="small" color="action" />
            </Box>
            <Box
              display="flex"
              alignItems="center"
              justifyContent="center"
              width={28}
              height={28}
              border={`1px solid #DEDFE1`}
              borderRadius="4px"
              boxShadow="0px 4px 8px 0px rgba(16, 24, 64, 0.08)"
            >
              <AddIcon fontSize="small" color="action" />
            </Box>
          </Box>
        </Box>
        <div
          style={{
            border: `1px solid #EBEEF1`,
          }}
        />
        <Box
          display={"flex"}
          paddingLeft={3}
          paddingRight={3}
          paddingBottom={1}
          alignItems={"center"}
          justifyContent={"space-between"}
        >
          <Typography variant="B4" color={theme.palette.textColor.highEmphasis}>
            Address information
          </Typography>
          <Button
            variant="outlined"
            size="small"
            sx={{
              color: theme.palette.textColor.mediumEmphasis,
              textTransform: "none",
              boxShadow: "0px 4px 8px 0px rgba(16, 24, 64, 0.08)",
            }}
          >
            Add address
          </Button>
        </Box>
        <Box
          display={"flex"}
          flexDirection={"column"}
          position="sticky"
          bottom={0}
          bgcolor={theme.palette.background.default}
        >
          <div
            style={{
              border: `1px solid #EBEEF1`,
            }}
          />

          <Box
            display={"flex"}
            paddingLeft={3}
            paddingRight={3}
            paddingTop={1.5}
            paddingBottom={1.5}
            justifyContent={"flex-end"}
            gap={2}
          >
            <Button
              variant="outlined"
              size="small"
              sx={{
                color: theme.palette.textColor.mediumEmphasis,
                textTransform: "none",
              }}
              onClick={props.onClose}
            >
              Cancel
            </Button>
            <Button
              variant="contained"
              color="primary"
              size="small"
              sx={{
                color: theme.palette.textColor.white,
                bgcolor: theme.palette.primary.primary500,
                textTransform: "none",
                "&:hover": {
                  bgcolor: theme.palette.primary.primary500,
                },
              }}
              onClick={handleButtonClick}
            >
              {props.add && "Add stakeholder"}
              {props.update && "Update"}
            </Button>
          </Box>
        </Box>
      </Box>
    </div>
  );
};

export default StakeholderDetailsCard;
