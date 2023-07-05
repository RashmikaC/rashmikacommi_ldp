import React, { useState } from "react";
import CandidateRow from "components/molecules/CandidateRow";
import { Box } from "@mui/material";
import { CANDIDATE_DATA, HEADERS } from "components/utils/constants";
import Typography from "components/atoms/Typography";
import { Candidate } from "components/utils/types";
import CandidateDetails from "components/organisms/CandidateDetails";

const CandidateTable = () => {
  const [name, setName] = useState("");
  const [id, setId] = useState("");
  const [branch, setBranch] = useState("");
  const [year, setYear] = useState<number>();
  const [cgpa, setCgpa] = useState<number>();
  const [popUp, setPopUp] = useState(false);

  const handleClick = (candidate: Candidate) => {
    setName(candidate.name);
    setId(candidate.id);
    setBranch(candidate.branch);
    setYear(candidate.year);
    setCgpa(candidate.cgpa);
    setPopUp(true);
  };

  const handleClose = () => {
    setPopUp(false);
  };

  return (
    <div>
      <Box paddingLeft={4} paddingTop={4}>
        <Box
          display={"flex"}
          gap={2}
          justifyContent={"space-around"}
          paddingRight={10}
          paddingBottom={5}
        >
          {HEADERS.map((header) => (
            <Typography variant="body1" width={"100px"} key={header}>
              {header}
            </Typography>
          ))}
        </Box>

        <Box display="flex" flexDirection={"column"} gap={3}>
          {CANDIDATE_DATA.map((candidate) => (
            <Box key={candidate.id}>
              <Box borderBottom={`1px solid #EBEEF1`} />
              <div
                onClick={() => handleClick(candidate)}
                style={{
                  cursor: "pointer",
                }}
              >
                <CandidateRow
                  name={candidate.name}
                  id={candidate.id}
                  branch={candidate.branch}
                  year={candidate.year}
                  cgpa={candidate.cgpa}
                />
                <Box borderBottom={`1px solid #EBEEF1`} />
              </div>
            </Box>
          ))}
        </Box>
        {popUp && (
          <Box>
            <CandidateDetails
              name={name}
              id={id}
              branch={branch}
              year={year!}
              cgpa={cgpa!}
              onClose={handleClose}
            />
          </Box>
        )}
      </Box>
    </div>
  );
};

export default CandidateTable;
