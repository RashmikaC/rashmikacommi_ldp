import { Box } from "@mui/material";
import React from "react";
import Typography from "components/atoms/Typography";

interface CandidateRowProps {
  name: string;
  id: string;
  branch: string;
  year: number;
  cgpa: number;
}

const CandidateRow = (props: CandidateRowProps) => {
  return (
    <div>
      <Box
        display={"flex"}
        gap={2}
        justifyContent={"space-around"}
        paddingRight={10}
      >
        <Typography variant="body2" width={'100px'}>{props.name}</Typography>
        <Typography variant="body2" width={'100px'}>{props.id}</Typography>
        <Typography variant="body2" width={'100px'}>{props.branch}</Typography>
        <Typography variant="body2" width={'100px'}>{props.year}</Typography>
        <Typography variant="body2" width={'100px'}>{props.cgpa}</Typography>
      </Box>
    </div>
  );
};

export default CandidateRow;
