import React from "react";
import { Backdrop, Box } from "@mui/material";
import Typography from "../../atoms/Typography";
import Button from "../../atoms/Button";

interface CandidateDetailsProps {
  name: string;
  id: string;
  branch: string;
  year: number;
  cgpa: number;
  onClose: () => void;
}

const CandidateDetails = (props: CandidateDetailsProps) => {
  return (
    <div>
      <Backdrop open={true} sx={{ zIndex: 1, backgroundColor: "#C0C8D2A6" }}>
        <Box
          display={"flex"}
          flexDirection={'column'}
          justifyContent={"center"}
          padding={3}
          bgcolor={"#FFFFFF"}
          borderRadius={'10px'}
          gap={2}
        >
          <Typography variant="h4" align="center">
            Candidate Details :
          </Typography>
          <Typography variant="h6" align="center">
            Name: {props.name}
          </Typography>
          <Typography variant="h6" align="center">
            ID: {props.id}
          </Typography>
          <Typography variant="h6" align="center">
            Branch: {props.branch}
          </Typography>
          <Typography variant="h6" align="center">
            Year: {props.year}
          </Typography>
          <Typography variant="h6" align="center">
            CGPA: {props.cgpa}
          </Typography>
          <Box display="flex" justifyContent="center" marginTop={3}>
            <Button
              variant="contained"
              color="secondary"
              size="small"
              onClick={() => props.onClose()}
              sx={{ textTransform: "none" }}
            >
              Close
            </Button>
          </Box>
        </Box>
      </Backdrop>
    </div>
  );
};

export default CandidateDetails;
